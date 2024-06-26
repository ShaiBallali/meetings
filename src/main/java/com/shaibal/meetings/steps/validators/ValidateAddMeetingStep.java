package com.shaibal.meetings.steps.validators;

import com.shaibal.meetings.Context;
import com.shaibal.meetings.constants.ContextConstants;
import com.shaibal.meetings.models.MeetingRequestDTO;
import com.shaibal.meetings.services.validators.ValidateAddMeetingService;
import com.shaibal.meetings.steps.IStep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ValidateAddMeetingStep implements IStep {

    private final ValidateAddMeetingService validateAddMeetingService;

    @Override
    public void execute(Context context) {
        MeetingRequestDTO meetingToAdd = (MeetingRequestDTO) context.getValue(ContextConstants.MEETING_REQUEST_DTO_TO_ADD);

        validateAddMeetingService.validate(meetingToAdd);
    }
}
