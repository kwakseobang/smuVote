package com.kwakmunsu.smuvote.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class VoteParticipation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // 사용자 참조
    @ManyToOne
    private User user;

    // 투표 항목 참조
    @ManyToOne
    private VoteItem voteItem;

}

