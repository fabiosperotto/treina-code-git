let valor = [1, 2, 3, 4, 5, 6, 7, 8, 15, 12]

valor.map(x => {
  if(x%3 == 0 && x%5 != 0){
    console.log('Fizz')
  }
  else if(x%5 == 0 && x%3 != 0){
    console.log('Buzz')
  }
  else if(x%5 == 0 && x%3 == 0){
    console.log('FizzBuzz')
  }
  else{
    console.log(x)
  }
})