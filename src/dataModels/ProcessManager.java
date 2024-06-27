package dataModels;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ProcessManager {
	
	private ArrayList<Process> processes;
	private LinkedList<Process> pendingProcessesHistory;
	private LinkedList<Process> completedProcessesHistory;

	
	public ProcessManager() {
		super();
		this.processes = new ArrayList<>();
		this.pendingProcessesHistory = new LinkedList<>();
	    this.completedProcessesHistory = new LinkedList<>();
	}
	
	public void addProcess(Process process) {
        processes.add(process);
        if (process.getStatus().equals("Pending")) {
            pendingProcessesHistory.add(process);
        }
    }
	
	public boolean removeProcess(int processId) {
        for (Process process : processes) {
            if (process.getProcessId() == processId) {
                processes.remove(process);
                return true;
            }
        }
        return false;
    }
	
	public Process searchProcess(int processId) {
        for (Process process : processes) {
            if (process.getProcessId() == processId) {
                return process;
            }
        }
        return null;
    }

	public ArrayList<Process> listProcesses() {
        return new ArrayList<>(processes);
    }

	public boolean updateProcessStatus(int processId, String newStatus) {
        for (Process process : processes) {
            if (process.getProcessId() == processId) {
                process.setStatus(newStatus);
                if (newStatus.equals("Completed")) {
                    addCompletedProcess(process);
                }
                return true;
            }
        }
        return false;
    }

	public void addPendingProcess(Process process) {
		// TODO Auto-generated method stub
        pendingProcessesHistory.add(process);
    }

	public void addCompletedProcess(Process process) {
		// TODO Auto-generated method stub
        completedProcessesHistory.add(process);
    }
	   
	public List<Process> getPendingProcessesHistory() {
        return new LinkedList<>(pendingProcessesHistory);
    }
       
       public List<Process> getCompletedProcessesHistory(){
		return new LinkedList<>(completedProcessesHistory);   
       }	
}
