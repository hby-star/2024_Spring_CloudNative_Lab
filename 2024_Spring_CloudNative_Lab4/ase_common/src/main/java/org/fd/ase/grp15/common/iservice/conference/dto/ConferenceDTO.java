package org.fd.ase.grp15.common.iservice.conference.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class ConferenceDTO implements Serializable {

    private String conferenceName;

    private String conferenceAbbr;

    private LocalDateTime conferenceStartAt;

    private LocalDateTime conferenceEndAt;

    private String venue;

    private LocalDateTime submissionDeadline;

    private LocalDateTime reviewResultAnnounceAt;

    private String conferenceStatus;

    private List<String> topics;              // 会议topic（不少于1个）
}
