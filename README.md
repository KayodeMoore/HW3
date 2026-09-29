Name: Kayode Moore

Programming Language: Java

IDE / Editor: IntelliJ IDEA

 
Part 2 — ADT Questions
Before writing your code, answer the following questions.
Use complete sentences.

Question 1
What does ADT stand for?

Answer:
ADT stands for Abstract Data Type.

Question 2
In your own words, what is an Abstract Data Type?

Answer:
An Abstract Data Type is a set of rules and behavior placed on a data structure to describe how it can be used.

Question 3
What is the difference between an ADT and its implementation?
Use the following idea in your explanation:
WHAT
versus:
HOW

Answer:
An ADT defines the rules and behavior for how a data structure is used, while its implementation is the data structure itself.

Question 4
Can two programmers create different implementations of the same ADT?
Explain your answer.

Answer:
Yes. One programmer could implement the same ADT as an array, while the other could implement it as a linked list.

Question 5
If one programmer creates a Stack using an array and another creates a Stack using a linked list, are both still Stacks?
Explain why.

Answer:
Yes, because both would follow the rule of LIFO and the same push, pop, and peek operations.
 
Part 8 — Stack Questions
Answer the following.

Question 6
What does LIFO mean?

Answer:
LIFO means the last thing added is the first to be removed.

Question 7
Why did 55 get removed before 15?

Answer:
55 got removed before 15 because it was added later.

Question 8
If the Stack contains:
A
B
C
D
and D was added last, which item should pop() remove first?

Answer:
pop() should remove D first.

Question 9
Give one real-world or software example where a Stack could be useful.

Examples discussed in class may include:
●	Browser Back history
●	Undo operations
●	Function calls
Explain your example.

Answer:
One real-world example of a Stack could be a stack of plastic cups. The last cup added to the stack will be the first to be taken.
 
Part 14 — Queue Questions
Question 10
What does FIFO mean?

Answer:
FIFO means the first thing added is the first to be removed.

Question 11
Why was 15 removed before 55?

Answer:
15 was removed before 55 because 15 was added before 55.

Question 12
If customers enter a line in this order:
Alex
Maria
John
Sarah
who should leave the Queue first?

Answer:
Alex should leave the Queue first.

Question 13
Give one real-world or software example where a Queue could be useful.
Possible examples:
●	Printer jobs
●	Customer-service requests
●	Tasks waiting to be processed
●	People waiting in line
Explain your answer.

Answer:
One real-world example of a Queue is a stop sign. The first person at the sign is the first to leave, and as more people approach the sign they join the back. 


Part 15 — Stack vs Queue
For each scenario below, choose:
Stack
or:
Queue
Then explain your answer in one or two sentences.
 
Scenario 1 — Undo Feature
A text editor remembers your recent actions.
If you type:
A
B
C
the most recent action should be undone first.
Stack or Queue?
Explain.

Answer:
That would be a stack since the last action performed is the first to be undone.
 
Scenario 2 — Printer
Three students send documents to a printer.
The first document submitted should normally print first.
Stack or Queue?
Explain.

Answer:
That would be a queue since the first document submitted would be printed first.
 
Scenario 3 — Browser Back Button
You visit:
Google
YouTube
GitHub
Amazon
You click the Back button.
Which page should appear first?
What ADT does this resemble?

Answer:
The last page visited should appear first, and this resembles a Stack.
 
Scenario 4 — Customer Service
Customers are waiting to talk to an employee.
The person who arrived first should normally be helped first.
Stack or Queue?

Answer:
Queue, since the person who arrived first would be helped first.
 
Scenario 5 — Plates
You place five plates on top of one another.
Which ADT does this represent?
Explain.

Answer:
This represents a Stack because the 5th plate would be the last to be added but the first to be taken.

 
Part 16 — Predict the Output
Do not run the following examples until after you write your answers.
Stack
Start with an empty Stack.
push(7)
push(12)
push(18)
pop()
push(22)
peek()

Question 14
What does pop() return?

Answer:
pop() returns 18.

Question 15
What does the final peek() return?

Answer:
The final peek() returns 22.

 
Queue
Start with an empty Queue.
enqueue(7)
enqueue(12)
enqueue(18)
dequeue()
enqueue(22)
peek()

Question 16
What does dequeue() return?

Answer:
dequeue() returns 7

Question 17
What does the final peek() return?

Answer:
The final peek() returns 12.

 
Part 17 — Compare the ADTs
Complete the table.

Feature:	          Stack	  Queue
Rule:	              LIFO	  FIFO
Add operation:	    push() 	enqueue() 
Remove operation:	  pop()	  dequeue()
View next item:	    peek()	peek()
First item removed:	top	    front

 
Part 18 — Connect the ADT to the Implementation
Answer the following.
Question 18
If you implement a Stack using an array, which part is the ADT?

Answer:
The Stack is the ADT.

Question 19
Which part is the implementation?

Answer:
The array is the implementation.

Question 20
If you replace the array with a linked list but keep the same Stack operations, did the ADT change?
Explain.

Answer:
The ADT remains a stack, but the implementation is changed from an array to a linked list.

Program Output
STACK DEMONSTRATION
Adding:
55
45
35
25
15
Top item:
55
Removing:
55
Removing:
45
New top:
35
Is Stack empty?
false

QUEUE DEMONSTRATION
Adding:
15
25
35
45
55
Front item:
15
Removing:
15
Removing:
25
New front:
35
Is Queue empty?
false
