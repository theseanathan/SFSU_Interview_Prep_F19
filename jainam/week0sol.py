data=[7,1,5,3,6,4]
profit = 0
for i in range(0,len(data)):
    tempprofit = max(data[i:len(data)]) - data[i]
    if(tempprofit>profit):
        profit = tempprofit
