
const func = async () => {
  const response = await window.versions.ping()
  console.log("aquiiiiiiiiiiiiiiiiiiiii") // prints out 'pong'
  const information = document.getElementById('info')
  information.innerText = `This app is using Chrome ${response}`
}

func()

console.log('aquii')

_e