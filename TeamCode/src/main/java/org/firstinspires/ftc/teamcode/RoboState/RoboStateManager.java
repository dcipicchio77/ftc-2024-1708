package org.firstinspires.ftc.teamcode.RoboState;

// Class managing the collection of robo states

import java.util.List;

public class RoboStateManager {

    List<RoboState> _STATES;
    boolean _isExecuting;
    int _stateIndex;
    RoboState _activeState;
    boolean _paused;

    public RoboStateManager()
    {
        _isExecuting = false;
        _paused = false;
        _stateIndex = 0;
    }

    public void AddState(RoboState state)
    {
        _STATES.add(state);
    }

    public void StartStateExecute()
    {
        if ((_STATES.size() > 0) && (!_isExecuting))
        {
            _isExecuting = true;

            _activeState = _STATES.get(_stateIndex);
        }
    }

    public void PauseExecute()
    {
        _paused = true;
    }

    public void ResumeExecute()
    {
        _paused = false;
    }

    public void EndExecute()
    {
        // Terminate current state and end
        _activeState.terminate();
        _isExecuting = false;
        _paused = false;
    }

    public boolean MoreStates()
    {
        return (_stateIndex < _STATES.size());
    }

    public void NextState()
    {
        if (MoreStates() && _isExecuting)
        {
            _activeState.terminate();

            _stateIndex += 1;
            _activeState = _STATES.get(_stateIndex);

            // Init the new state
            _activeState.init();
            
            // Do one iteration of the new state
            _activeState.execute();
        }
        else
        {
            EndExecute();
        }
    }

    public boolean IsStateFinished()
    {
        return _activeState.isfinished();
    }

    public void ClearStates()
    {
        _STATES.clear();
        _isExecuting = false;
    }

    public void ExecuteActive()
    {
        if (!_paused)
        {
            _activeState.execute();
        }        
    }    
}
