nums_count = int(input("Enter how many numbers you want to take input: "))
user_list=[]
for i in range(nums_count):
    user_input = input("Enter something to add in the list: ")
    user_list.append(user_input)
if user_list[0] == user_list[-1]:
    print(True)
