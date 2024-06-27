**Process Management System**

You are tasked with creating a process management system that handles a large number of processes and operations efficiently. The system should support various functionalities such as adding processes, removing processes, searching for processes, and maintaining a history of completed and pending processes. You will use both ArrayList and LinkedList to optimize different parts of the system based on the operations performed.
**Requirements**

**Part 1: Data Models**

**1.	Process Class:**
Create a Process class with the following attributes:
o	int processId
o	String processName
o	String status (values: "Pending", "Running", "Completed")

**2.	ProcessManager Class: **
Create a ProcessManager class that uses both ArrayList and LinkedList to manage processes.

**Part 2: Functionality Implementation**

Implement the following functionalities in the ProcessManager class:
**1.	Add Process**
o	Use an ArrayList to store all processes.
o	Method: void addProcess(Process process)

**2.	Remove Process**
o	Remove a process by its ID.
o	Method: boolean removeProcess(int processId)

**3.	Search for a Process**
o	Search for a process by its ID and return the process details.
o	Method: Process searchProcess(int processId)

**4.	List All Processes**
o	List all processes with their details.
o	Method: List<Process> listAllProcesses()

**5.	Update Process Status**
o	Update the status of a process by its ID.
o	Method: boolean updateProcessStatus(int processId, String newStatus)

**6.	Pending and Completed Process History**
o	Use a LinkedList to maintain a history of completed and pending processes.
o	Methods:
	void addPendingProcess(Process process)
	void addCompletedProcess(Process process)
	List<Process> getPendingProcessesHistory()
	List<Process> getCompletedProcessesHistory()

