package org.topdesk.maven.tracker;

import org.apache.maven.execution.AbstractExecutionListener;
import org.apache.maven.execution.ExecutionEvent;

public class TrackingExecutionListener extends AbstractExecutionListener {

	@Override
	public void projectDiscoveryStarted(ExecutionEvent event) {
		System.out.println("projectDiscoveryStarted");
	}

	@Override
	public void sessionStarted(ExecutionEvent event) {
		System.out.println("sessionStarted");
	}

	@Override
	public void sessionEnded(ExecutionEvent event) {
		System.out.println("sessionEnded");
	}

	@Override
	public void projectSkipped(ExecutionEvent event) {
		System.out.println("projectSkipped");
	}

	@Override
	public void projectStarted(ExecutionEvent event) {
		System.out.println("projectStarted");
	}

	@Override
	public void projectSucceeded(ExecutionEvent event) {
		System.out.println("projectSucceeded");
	}

	@Override
	public void projectFailed(ExecutionEvent event) {
		System.out.println("projectFailed");
	}

	@Override
	public void forkStarted(ExecutionEvent event) {
		System.out.println("forkStarted");
	}

	@Override
	public void forkSucceeded(ExecutionEvent event) {
		System.out.println("forkSucceeded");
	}

	@Override
	public void forkFailed(ExecutionEvent event) {
		System.out.println("forkFailed");
	}

	@Override
	public void mojoSkipped(ExecutionEvent event) {
		System.out.println("mojoSkipped");
	}

	@Override
	public void mojoStarted(ExecutionEvent event) {
		System.out.println("mojoStarted");
	}

	@Override
	public void mojoSucceeded(ExecutionEvent event) {
		System.out.println("mojoSucceeded");
	}

	@Override
	public void mojoFailed(ExecutionEvent event) {
		System.out.println("mojoFailed");
	}

	@Override
	public void forkedProjectStarted(ExecutionEvent event) {
		System.out.println("forkedProjectStarted");
	}

	@Override
	public void forkedProjectSucceeded(ExecutionEvent event) {
		System.out.println("forkedProjectSucceeded");
	}

	@Override
	public void forkedProjectFailed(ExecutionEvent event) {
		System.out.println("forkedProjectFailed");
	}
	
}
