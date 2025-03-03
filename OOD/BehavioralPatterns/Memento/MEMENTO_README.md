1/ 让 Caretaker 只存储状态，而不存储 Originator, 这样 Caretaker 不能修改 Originator 的状态。  
2/ Memento 只存储状态的快照，而不是 Originator 的完整对象。    
3/ Originator 负责创建和恢复 Memento，这样可以 隐藏内部细节，保证封装性。  

https://www.youtube.com/watch?v=enfFyxi3kok
