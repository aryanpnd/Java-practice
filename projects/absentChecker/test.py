def find_missing_numbers(arr):
    n = len(arr)
    max_num = max(arr)
    min_num = min(arr)
    missing_numbers = []

    num_set = set(arr)

    for num in range(min_num, max_num + 1):
        if num not in num_set:
            missing_numbers.append(num)

    return missing_numbers

# Example usage
roll_numbers = [1,5,10,80]
missing_nums = find_missing_numbers(roll_numbers)
print("Missing numbers:", missing_nums)
