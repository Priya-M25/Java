def operationBinaryString(arr):
    result = None
    i = 0
    while i + 2 < len(arr):
        if arr[i].isdigit() and arr[i + 1] == 'A' and arr[i + 2].isdigit():
            if result is None:
                result = int(arr[i]) & int(arr[i + 2])
            else:
                result = result & int(arr[i + 2])
        elif arr[i].isdigit() and arr[i + 1] == 'B' and arr[i + 2].isdigit():
            if result is None:
                result = int(arr[i]) | int(arr[i + 2])
            else:
                result |=  int(arr[i + 2])  # Accumulate using bitwise OR
        elif arr[i].isdigit() and arr[i + 1] == 'C' and arr[i + 2].isdigit():
            if result is None:
                result = int(arr[i]) ^ int(arr[i + 2])
            else:
                result ^= int(arr[i + 2])  # Accumulate using bitwise XOR
        i += 2  # Move to the next group of three characters
    return result

arr = "1C0C1C1A0B1"
#arr="1A0B1A1C0A0"
#arr="0B1A0B1C0"
print(operationBinaryString(arr))  # Output: 1
