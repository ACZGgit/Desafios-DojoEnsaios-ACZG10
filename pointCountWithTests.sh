#!/bin/bash

totalPointFileName="./totalPoint.txt"
testLogFile="./testLog.txt"

declare -A gitHubBotCredentials
gitHubBotCredentials[name]="ActZimBot"
gitHubBotCredentials[email]="41898282+github-actions[bot]@users.noreply.github.com"


commitChanges(){

  git config --local user.email "${gitHubBotCredentials[email]}"
  git config --local user.name "${gitHubBotCredentials[name]}"
  git add ${totalPointFileName}
  git add ${testLogFile}
  git commit -a -m "pipeline[git action]: contabilização de pontos"

}

prepareTestLogFile(){

  if [ -e ${testLogFile} ] ; then
    rm ${testLogFile}
    echo "Limpando log de pontos..."
  fi

  gradle wrapper
  ./gradlew test >> "${testLogFile}"

  LogLinesPassedFailed=$(grep '[0-9][ ]*PASSED\|[0-9][ ]*FAILED' "${testLogFile}")
  rm ${testLogFile}

  IFS=$'\n'
  for line in ${LogLinesPassedFailed}; do
    echo "${line//[a-zA-Z]*|[ ]/}" >> ${testLogFile}
  done

}

sumPoints(){

    cleanFile "$1"
    passedTests=$(grep '[0-9][ ]*PASSED' "$2")

    IFS=$'\n'
    for line in ${passedTests}; do
      line="${line//[A-Za-z0-9]*[_]/}"
      passedRequimentPoints="${line//[ ][A-Za-z]*/}"
      countTotalPoint "${passedRequimentPoints}"
    done

}

cleanFile(){
  rm "$1"
  echo "" >> "$1"
}

countTotalPoint(){

  touch ${totalPointFileName}
  totalPointFileLine1=$(head -1 ${totalPointFileName})

  rm ${totalPointFileName}

  echo $((totalPointFileLine1 + $1)) >> ${totalPointFileName}

}


main(){

  echo "Realizando contagem de pontos"
  prepareTestLogFile
  sumPoints "${totalPointFileName}" "${testLogFile}"
  commitChanges
  echo "Contagem de pontos finalizada!!"

}

main