package com.liuxun.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import com.liuxun.cloud.entity.User;
import com.liuxun.cloud.repository.UserRepository;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private EurekaClient eurekaClient;

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/simple/{id}")
	public User findById(@PathVariable Long id) {
		return userRepository.findOne(id);
	}

	@GetMapping("/eureka-instance")
	public String serviceUrl() {
		InstanceInfo instance = this.eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER", false);
		return instance.getHomePageUrl();
	}
	
	@GetMapping("/instance-info")
	public ServiceInstance showInfo() {
		ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
		return localServiceInstance;
	}

	@PostMapping("/user")
	public User postUser(@RequestBody User user){
		return user;
	}

	@GetMapping("/get-user")
	public User getUser(User user){
		return user;
	}

	@GetMapping("list-all")
	public List<User> listAll(){
		return userRepository.findAll();
	}

}
