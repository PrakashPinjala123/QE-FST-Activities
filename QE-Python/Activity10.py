nums_count = int(input("Enter how many numbers you want to add: "))
tuple_list =[]
for i in range(nums_count):
    num = int(input("Enter a number to add"))
    tuple_list.append(num)
tuple_list =tuple(tuple_list)
for i in tuple_list:
    if i%5==0:
        print(i)