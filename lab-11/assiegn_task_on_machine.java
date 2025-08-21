class AssignTaskOnMachine{
    public static void main(String[] args) {
        int nMachine = 3;
        int nTasks = 3;
        Tasks[] tasks = {new Tasks(3,4),new Tasks(2,4),new Tasks(1,2),};
        VirtualMachine[] virtualMachines = {new VirtualMachine(4,10),new VirtualMachine(2,4),new VirtualMachine(8,10)};

        int[][] costMatrix = {{1,2,3},{3,1,5},{2,2,4}};

        for(int i = 0; i < nTasks; i++){
            int minValue = Integer.MAX_VALUE;
            int minIndex = 0;

            for (int j = 0; j < costMatrix[i].length; j++) {
                if(minValue > costMatrix[j][i] && virtualMachines[j].cpu >= tasks[j].cpu && virtualMachines[j].ram >= tasks[j].ram){
                    minIndex = j; 
                    minValue = costMatrix[j][i];
                }
            }

            System.out.println("virtualMachine : " + minIndex + " -> Task : " + i);

            virtualMachines[minIndex] = new VirtualMachine(virtualMachines[minIndex].cpu - tasks[i].cpu,virtualMachines[minIndex].ram - tasks[i].ram);
            System.out.println(virtualMachines[minIndex].cpu +" "+ virtualMachines[minIndex].ram);
        }
    }
}

class VirtualMachine{
    int cpu;
    int ram;

    public VirtualMachine(int cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
}

class Tasks{
    int cpu;
    int ram;

    public Tasks(int cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
} 

