const calcularAumento = (salario) => {
    if (salario > 2000.00) {
        return 0.04;
    } else if (salario >= 1200.01 && salario <= 2000.00) {
        return 0.07;
    } else if (salario >= 800.01 && salario <= 1200.00) {
        return 0.1;
    } else if (salario >= 400.01 && salario <= 800.00) {
        return 0.12;
    } else {
        return 0.15;
    }
};

module.exports = calcularAumento;