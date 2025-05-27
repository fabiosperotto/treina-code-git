import Text.Read (readMaybe)
import Text.Printf (printf)

main :: IO ()
main = do
    (id, quantidade, valor) <- getInput
    printf "O produto ID %d custa R$ %.2f" id (fromIntegral quantidade * valor)

getInput :: IO (Int, Int, Float)
getInput = do
    printf "Insira o ID, Quantidade e Preco. Respectivamente:\n"
    input <- getLine
    let parts = words input
    case parts of
        [aStr, bStr, cStr] ->
            case (readMaybe aStr :: Maybe Int,
                  readMaybe bStr :: Maybe Int,
                  readMaybe cStr :: Maybe Float) of
                (Just a, Just b, Just c) -> return (a, b, c)
                _ -> retry
        _ -> retry
  where
    retry = do
        printf "\nInput invalida. Por favor insira dois numeros inteiros seguido de um decimal.\n"
        getInput
