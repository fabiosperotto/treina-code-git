const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin, 
  output: process.stdout 
});

const escolhas = {
  "pedra": ["tesoura", "lagarto"],
  "papel": ["pedra", "spock"],
  "tesoura": ["papel", "lagarto"],
  "lagarto": ["papel", "spock"],
  "spock": ["tesoura", "pedra"]
};

let pontosJogador1 = 0;
let pontosJogador2 = 0;
let rodada = 1;
let totalRodadas = 0;

function verificaFimDoJogo() {
  if (rodada > totalRodadas) {
    console.log(`\nResultado final: Jogador 1 ( ${pontosJogador1} ) x ( ${pontosJogador2} ) Jogador 2\n`);
    rl.close(); 
  } else {
    rl.question(`Rodada ${rodada}: Ação de Jogador 1: `, function(escolhaJogador1) {
      rl.question(`Rodada ${rodada}: Ação de Jogador 2: `, function(escolhaJogador2) {
        escolhaJogador1 = escolhaJogador1.toLowerCase();
        escolhaJogador2 = escolhaJogador2.toLowerCase();

        if (escolhaJogador1 === escolhaJogador2) {
          console.log("Empate");
        } else if (escolhas[escolhaJogador1].includes(escolhaJogador2)) {
          console.log("Jogador 1");
          pontosJogador1++;
        } else {
          console.log("Jogador 2");
          pontosJogador2++;
        }

        rodada++;
        verificaFimDoJogo();
      });
    });
  }
}

rl.question("Quantas partidas serão jogadas? ", function(totalDeRodadas) {
  totalRodadas = parseInt(totalDeRodadas);
  verificaFimDoJogo();
});
