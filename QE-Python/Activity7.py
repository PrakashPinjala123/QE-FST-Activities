nums_count = int(input("Enter how many numbers you want to take input: "))
nums_list=[]
for i in range(nums_count):
    num=int(input("Enter a number to add into list: "))
    nums_list.append(num)
sum_nums=0
for i in nums_list:
    sum_nums+=i 
print(sum_nums)