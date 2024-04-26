const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

var reajuste = 0, novoSalario = 0;

rl.question('Por favor, informe o seu salário: ', (salarioAtualStr) => {
    const salarioAtual = parseFloat(salarioAtualStr);
    if (!isNaN(salarioAtual)) {
        calcularReajuste(salarioAtual);
    } else {
        console.log('Por favor, insira um valor válido para o salário.');
        rl.close();
    }
});

const calcularReajuste = function(salarioAtual) {
    console.log('O salário atual é: R$', salarioAtual);

    switch (true) {
        case salarioAtual <= 400 && salarioAtual >= 0:
            console.log('O salário se enquadra em um reajuste de 15%');
            reajuste = 0.15;
            break;
        case salarioAtual <= 800:
            console.log('O salário se enquadra em um reajuste de 12%');
            reajuste = 0.12;
            break;
        case salarioAtual <= 1200:
            console.log('O salário se enquadra em um reajuste de 10%');
            reajuste = 0.10;
            break;
        case salarioAtual <= 2000:
            console.log('O salário se enquadra em um reajuste de 7%');
            reajuste = 0.07;
            break;
        default:
            console.log('O salário se enquadra em um reajuste de 4%');
            reajuste = 0.04;
            break;
    }
    

    novoSalario =  salarioAtual + (reajuste * salarioAtual);
    console.log(`Você receberá: R$ ${novoSalario.toFixed(2)} (${reajuste * 100}%)`)
}