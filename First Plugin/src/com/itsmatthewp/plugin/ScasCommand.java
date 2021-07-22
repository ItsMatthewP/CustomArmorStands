package com.itsmatthewp.plugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.util.EulerAngle;

public class ScasCommand implements CommandExecutor {

	// Command: /scas <number> <number> <number> <number> <number>
	//                 head     r-arm    l-arm    r-leg    l-leg
	//			 cmd    a0		 a1       a2       a3        a4
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
				
		Player player = (Player) sender;
		
		if (args.length < 5 & (!(args[0].equalsIgnoreCase("help")))) {
			player.sendMessage(ChatColor.GOLD + "Please provide all the correct arguments!");
		}	
			else {
			player.sendMessage(ChatColor.RED + "/scas " + ChatColor.GOLD + "format: /scas <Head Rotation> <Right Arm Rotation>"
					+ " <Left Arm Rotation> <Right Leg Rotation> <Left Leg Rotation>");
		}
			
		
		double head = Double.parseDouble(args[0]); 
		
		double rightArm = Double.parseDouble(args[1]);
		
		double leftArm = Double.parseDouble(args[2]);
		
		double rightLeg = Double.parseDouble(args[3]);
		
		double leftLeg = Double.parseDouble(args[4]);
		
		
			
		spawnStand((player.getLocation()), head, rightArm, leftArm, rightLeg, leftLeg);
		
			return false;
	}

	public void spawnStand(Location location, double head, double rightArm, double leftArm, double rightLeg, double leftLeg) {
		
		ArmorStand stand = (ArmorStand) location.getWorld().spawnEntity(location, EntityType.ARMOR_STAND);
		
		stand.setArms(true);
		
		stand.setHeadPose(new EulerAngle(Math.toRadians(head), 0, 0));
		stand.setRightArmPose(new EulerAngle(Math.toRadians(rightArm), 0, 0));
		stand.setLeftArmPose(new EulerAngle(Math.toRadians(leftArm), 0, 0));
		stand.setRightLegPose(new EulerAngle(Math.toRadians(rightLeg), 0, 0));
		stand.setLeftLegPose(new EulerAngle(Math.toRadians(leftLeg), 0, 0));
	}


}
