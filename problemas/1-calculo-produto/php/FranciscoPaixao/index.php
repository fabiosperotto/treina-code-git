<?php
function CalculoDoproduto($id, $quantidade, $valor_unitario){
    echo "O produto ID {$id} custa R$ {$valor_unitario}" . PHP_EOL;
}
for($i = 1;$i < count($argv)-2; $i+=3){
    CalculoDoproduto($argv[$i],$argv[$i+1],$argv[$i+2]);
}
