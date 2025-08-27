from src.python.fgh import pqr
import math

def plus(a, b):
    return a + b

the_list = [
    None,
    True,
    42,
    "abc",
    [1, 2, 3],
    {'a': 1, "b": 2},
    (1, 2, 3),
    pqr.glue,
]

sinus = math.sin(40)

rg = list(range(1, 11, 1))
print(pqr.glue(*rg))
for i in rg:
    print(i)
