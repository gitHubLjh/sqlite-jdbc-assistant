/*
 * Copyright (C) 2017-2018 dinstone<dinstone@163.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dinstone.sqlite.jdbc.transaction;

public class TransactionStatus {

	private final ConnectionHolder connectionHolder;

	private final boolean newTransaction;

	private boolean completed;

	public TransactionStatus(ConnectionHolder connectionHolder, boolean newTransaction) {
		this.connectionHolder = connectionHolder;
		this.newTransaction = newTransaction;
	}

	public ConnectionHolder getConnectionHolder() {
		return connectionHolder;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted() {
		this.completed = true;
	}

	public boolean isNewTransaction() {
		return newTransaction;
	}

}
