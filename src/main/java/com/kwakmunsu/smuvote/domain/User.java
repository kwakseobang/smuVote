package com.kwakmunsu.smuvote.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
   private String username;

   private String password;

   //사용자 작성한 투표
   @OneToMany(mappedBy = "creator", cascade = CascadeType.REMOVE)
   private List<Vote> voteList;

   //사용자가 투표한 항목
   @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
   private List<VoteParticipation> voteParticipationList;
}
