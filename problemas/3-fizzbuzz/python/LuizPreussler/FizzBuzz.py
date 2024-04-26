import os, sys

def init_args(sys_args: list) -> dict:
    if len(sys_args) != 2:
        raise ValueError("Wrong number of parameters")

    args = {
        "NUM_ITERATIONS": int(sys_args[1])
    }

    return args

def check_fizzbuzz(num: int) -> str:
        if num % 15 == 0:
            return "FizzBuzz"
        if num % 3 == 0:
            return "Fizz"
        if num % 5 == 0:
            return "Buzz"
        else:
            return str(num)

def iterate_fizzbuzz(iterations: int) -> None:
    for i in range(1, iterations + 1): # Usamos 'iterations + 1' já que iniciamos com 1, para percorer N iterations
        fizzbuzz_str = check_fizzbuzz(i)
        print(fizzbuzz_str)

if __name__ == "__main__":
    try:
        args = init_args(sys.argv)
        iterate_fizzbuzz(args["NUM_ITERATIONS"])
    except KeyboardInterrupt:
        print('Interrupted')
        try:
            sys.exit(0)
        except SystemExit:
            os._exit(0)
    except ValueError as ex:
        print(f'Error: {ex}')
    