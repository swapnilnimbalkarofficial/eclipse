package com.mobile;

import com.sim.Sim;
import com.sim.VodafoneSim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sim.AirtelSim;
import com.sim.IdeaSim;

public class RelianceMobile {
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	
	private Sim r= context.getBean(Sim.class);
	
	public RelianceMobile()
	{
		startMobile();
		try {
		r.startSim();
		}catch(NullPointerException e) {
			System.out.println("INSERT SIM");
		}
	}
	
	public void startMobile(){
		System.out.println("welcome to reliance mobile");
	}

}
