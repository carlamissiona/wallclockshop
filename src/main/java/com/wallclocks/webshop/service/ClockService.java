package com.wallclocks.webshop.service;


import com.wallclocks.webshop.data.ClockItem;

import java.util.Optional;

public interface ClockService {

	Iterable<ClockItem> findAll();
	ClockItem create(ClockItem clock);
	Optional<ClockItem> find(String productcode);
}