package dataModels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessManager processManager = new ProcessManager();
		Scanner sc =new Scanner(System.in);
		
		while (true) {
			System.out.println("Welocome to the Process Management System");
			System.out.println("1. Add Process");
            System.out.println("2. Remove Process");
            System.out.println("3. Search for a Process");
            System.out.println("4. List All Processes");
            System.out.println("5. Update Process Status");
            System.out.println("6. Get Pending Processes History");
            System.out.println("7. Get Completed Processes History");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            case 1:
            		System.out.print("Enter process ID: ");
                	int processId = sc.nextInt();
                	sc.nextLine();
                	System.out.print("Enter process name: ");
                	String processName = sc.nextLine();
                	 System.out.println("Enter process status (Pending, Running, Completed):");
                     String status = sc.nextLine();
                     Process process = new Process(processId, processName, status);
                     processManager.addProcess(process);
                	System.out.println("Process added successfully");
                break;
                
            case 2:
            	System.out.println("Enter the Process ID to remove: ");
            	processId =sc.nextInt();
            	if(processManager.removeProcess(processId)) {
            		System.out.println("Process removed Successfully");
            	}
            	else {
            		System.out.println("Process not found");
            	}
            	break;
            	
            case 3:
            	System.out.println("Enter the process ID to Search:");
            	processId =sc.nextInt();
            	Process searchedProcess = processManager.searchProcess(processId);
            	if(searchedProcess != null) {
            		System.out.println(searchedProcess);
            	}
            	else {
            		System.out.println("Process not found");
            	}
            	break;
            	
            case 4:
            	ArrayList<Process> processes =processManager.listProcesses();
            	for(Process p: processes) {
            		System.out.println(p);
            	}
            	break;
            	
            case 5:
                System.out.println("Enter the process ID to update:");
                processId = sc.nextInt();
                sc.nextLine(); 
                System.out.println("Enter the new status:");
                String newStatus = sc.nextLine();
                if (processManager.updateProcessStatus(processId, newStatus)) {
                    System.out.println("Process status updated successfully.");
                } else {
                    System.out.println("Process not found.");
                }
                break;
                
            case 6:
                ArrayList<Process> pendingProcesses = (ArrayList<Process>) processManager.getPendingProcessesHistory();
                for (Process p : pendingProcesses) {
                    System.out.println(p);
                }
                break;   
                
            case 7:
                ArrayList<Process> completedProcesses = (ArrayList<Process>) processManager.getCompletedProcessesHistory();
                for (Process p : completedProcesses) {
                    System.out.println(p);
                }
                break;
                
            case 8:
            	System.out.println("Thank You for Your Valuable Response");
                System.out.println("Exit");
                return;
            default:
                System.out.println("Please Enter the Correct choice");
                break;    
            }
		}
		
		
	}

}
