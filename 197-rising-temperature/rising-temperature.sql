# Write your MySQL query statement below
#select today.id
#from weather yesterday 
#cross join weather today 

#where datediff(today.recordDate,yesterday.recordDate)=1
    #and today.temperature >yesterday.temperature

    # optimised 
    select w2.id from Weather w1 join Weather w2 on w1.recordDate=date_sub(w2.recordDate,interval 1 day) 
where w2.temperature>w1.temperature;