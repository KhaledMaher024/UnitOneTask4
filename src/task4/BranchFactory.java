/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author GP65
 */
public class BranchFactory {

    public  Branch getBranch(String BranchType) {
        if (BranchType.equalsIgnoreCase("Internal")) {
            return new InternalBranch();
        } else if (BranchType.equalsIgnoreCase("external")) {
            return new ExternalBranch();
        }
        return null;
    }

}
