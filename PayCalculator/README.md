10. Read inputs
20. Calculate total
30. Calculate average
40. Find the ones which are higher than the average
50. Calculate gaps for values lower than the average
60. Store gaps in a pool
70. Calculate the gap for receivers
80. Distrubute gap from pool to receivers


class user {
    string name;
    float value;
}

init list // of users
print("enter first value");
list.add(scanner.nextInt);
print("enter second value");
list.add(scanner.nextInt);
print("enter third value");
list.add(scanner.nextInt);
.
.
.
print("enter nth value");
list.add(scanner.nextInt);

float total = sum(list);
float avg = total / list.size();

init hta // higher than avg
float pool;

for user in list:
    if user.value > avg:
        hta.add(user);
        continue;
    float gap = avg - user.value;
    pool += gap;
    print("{user.name} --{gap}--> pool");

for user in hta:
    float gap = user.value - avg;
    print("pool --{gap}--> {user.name});
                                                     

