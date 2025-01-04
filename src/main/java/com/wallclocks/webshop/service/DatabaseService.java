package com.wallclocks.webshop.service;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import com.wallclocks.webshop.data.ClockItem;

@Service
class DatabaseService implements ClockService {

	private final Map<String, ClockItem> clock_items = new ConcurrentHashMap<>();

	@Override
	public Iterable<ClockItem> findAll() {
		return clock_items.values();
	}

	@Override
	public ClockItem create(ClockItem clock_item) {
		clock_items.put(clock_item.getProductCode(), clock_item);
		return clock_item;
	}

	@Override
	public Optional<ClockItem> find(String productcode) {
		return Optional.ofNullable(clock_items.get(productcode));
	}
}