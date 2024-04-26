const readline = require("readline");
const calcularAumento = require("./calcularAumento");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
let funcionarioSalario = 0;

rl.question("Qual o seu salário? ", function(salario) {
    funcionarioSalario = parseFloat(salario);
    const percentualReajuste = calcularAumento(funcionarioSalario);
    const novoSalario =  funcionarioSalario + (funcionarioSalario * percentualReajuste);

    console.log(`Você receberá: R$ ${novoSalario.toFixed(2)} (${(percentualReajuste*100).toFixed(0)}%)`);
    rl.close();
});



rl.on("close", function() {
  process.exit(0);
});