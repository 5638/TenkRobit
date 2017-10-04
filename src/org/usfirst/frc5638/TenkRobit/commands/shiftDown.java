package org.usfirst.frc5638.TenkRobit.commands;

import org.usfirst.frc5638.TenkRobit.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class shiftDown extends Command {

    public shiftDown() {
    	requires(Robot.shiftSub);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.shiftSub.shiftDown();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
        //return false if not working
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
