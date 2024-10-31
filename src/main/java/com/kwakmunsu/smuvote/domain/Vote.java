package com.kwakmunsu.smuvote.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 200)
    private String title;

    @ManyToOne
    private User creator;

    @OneToMany(mappedBy = "vote",cascade = CascadeType.ALL)
    private List<VoteItem> voteItemList;
}
