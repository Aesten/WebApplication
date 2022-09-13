package com.emse.spring.faircorp.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "R_WINDOW")
public class Window {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private WindowStatus windowStatus;

    @Column(nullable = false)
    @ManyToOne
    private Room room;

    public Window() {
        new Window("unnamed", WindowStatus.CLOSED, new Room());
    }

    public Window(@NonNull String name, @NonNull WindowStatus status, @NonNull Room room) {
        this.windowStatus = status;
        this.name = name;
        this.room = room;
    }
}