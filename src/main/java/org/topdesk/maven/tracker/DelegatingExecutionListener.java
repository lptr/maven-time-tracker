package org.topdesk.maven.tracker;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.maven.execution.AbstractExecutionListener;
import org.apache.maven.execution.ExecutionEvent;
import org.apache.maven.execution.ExecutionListener;

public class DelegatingExecutionListener extends AbstractExecutionListener {
	
	private final List<ExecutionListener> delegates = new CopyOnWriteArrayList<ExecutionListener>();
	
	public DelegatingExecutionListener() {
	}

	public DelegatingExecutionListener(ExecutionListener... delegates) {
		this(Arrays.asList(delegates));
	}

	public DelegatingExecutionListener(Collection<ExecutionListener> delegates) {
		this.delegates.addAll(delegates);
	}
	
	public void addDelegate(ExecutionListener delegate) {
		delegates.add(delegate);
	}

	public void removeDelegate(ExecutionListener delegate) {
		delegates.remove(delegate);
	}

	@Override
	public void forkFailed(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.forkFailed(event);
		}
	}

	@Override
	public void forkStarted(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.forkStarted(event);
		}
	}

	@Override
	public void forkSucceeded(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.forkSucceeded(event);
		}
	}

	@Override
	public void forkedProjectFailed(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.forkedProjectFailed(event);
		}
	}

	@Override
	public void forkedProjectStarted(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.forkedProjectStarted(event);
		}
	}

	@Override
	public void forkedProjectSucceeded(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.forkedProjectSucceeded(event);
		}
	}

	@Override
	public void mojoFailed(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.mojoFailed(event);
		}
	}

	@Override
	public void mojoSkipped(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.mojoSkipped(event);
		}
	}

	@Override
	public void mojoStarted(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.mojoStarted(event);
		}
	}

	@Override
	public void mojoSucceeded(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.mojoSucceeded(event);
		}
	}

	@Override
	public void projectDiscoveryStarted(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.projectDiscoveryStarted(event);
		}
	}

	@Override
	public void projectFailed(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.projectFailed(event);
		}
	}

	@Override
	public void projectSkipped(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.projectSkipped(event);
		}
	}

	@Override
	public void projectStarted(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.projectStarted(event);
		}
	}

	@Override
	public void projectSucceeded(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.projectSucceeded(event);
		}
	}

	@Override
	public void sessionEnded(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.sessionEnded(event);
		}
	}

	@Override
	public void sessionStarted(ExecutionEvent event) {
		for (ExecutionListener delegate : delegates) {
			delegate.sessionStarted(event);
		}
	}

}
