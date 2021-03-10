package com.rz;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
  private String name;
  private ArrayList<Branch> branches;


  public Bank(String name){
    this.name = name;
    branches = new ArrayList<>();
  }


  public String getName() {
    return name;
  }

  public ArrayList<Branch> getBranches() {
    return branches;
  }

  public void addNewBranch(Branch newBranch) {
    this.branches.add(newBranch);
  }

  public ArrayList<String> getAllBranchNames() {
    ArrayList<String> names = new ArrayList<>();
    for(int i =0; i <= this.branches.size(); i ++) {
      String branchName = this.branches.get(i).getBranchName();
      names.add(branchName);
    }
    return names;
  }


}
