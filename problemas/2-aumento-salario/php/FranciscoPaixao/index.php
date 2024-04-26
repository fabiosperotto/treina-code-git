<?php
function AumentoSalarial($salario){
    if($salario > 0 && $salario <= 400){
        $aumento = 0.15;
    }else if($salario > 400 && $salario <= 800){
        $aumento = 0.12;
    }
    else if($salario > 800 && $salario <= 1200){
        $aumento = 0.10;
    }
    else if($salario > 1200 && $salario <= 2000){
        $aumento = 0.07;
    }
    else if($salario > 2000){
        $aumento = 0.04;
    }
    $aumento_res = $salario + $salario * $aumento;
    $aumento = $aumento*100;
    echo "Você receberá: R\${$aumento_res} ({$aumento}%)"  . PHP_EOL;
}
for($i = 1;$i < count($argv); $i++){
    AumentoSalarial($argv[$i]);
}
