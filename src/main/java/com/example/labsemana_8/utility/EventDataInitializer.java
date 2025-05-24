package com.example.labsemana_8.utility;

import com.example.labsemana_8.enums.StatusGuest;
import com.example.labsemana_8.model.Conference;
import com.example.labsemana_8.model.Guest;
import com.example.labsemana_8.model.Speaker;
import com.example.labsemana_8.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Component
public class EventDataInitializer implements CommandLineRunner {

    private final EventRepository eventRepository;
    private final GuestRepository guestRepository;
    private final SpeakerRepository speakerRepository;
    private final ConferenceRepository conferenceRepository;
    private final ExhibitionRepository exhibitionRepository;

    public EventDataInitializer(EventRepository eventRepository, GuestRepository guestRepository, SpeakerRepository speakerRepository, ConferenceRepository conferenceRepository, ExhibitionRepository exhibitionRepository) {
        this.eventRepository = eventRepository;
        this.guestRepository = guestRepository;
        this.speakerRepository = speakerRepository;
        this.conferenceRepository = conferenceRepository;
        this.exhibitionRepository = exhibitionRepository;
    }

    @Override
    public void run(String...arg)throws Exception{


        //Añadiendo a los Speakers
        Speaker speaker1 = new Speaker();
        speaker1.setName("Gallo");
        speaker1.setPresentationDuration(1);

        Speaker speaker2 = new Speaker();
        speaker2.setName("Bob");
        speaker2.setPresentationDuration(2);

        speakerRepository.saveAll(List.of(speaker1, speaker2));

        //Crear conferencia
        Conference conference1 = new Conference();
        conference1.setTitle("Partido de futbol benéfico");
        conference1.setDate(LocalDate.now());
        conference1.setDuration(2);
        conference1.setLocation("Pabellón Municipal");
        conference1.setSpeakers(List.of(speaker1));


        Conference conference2 = new Conference();
        conference2.setTitle("Boda de plata");
        conference2.setDate(LocalDate.now());
        conference2.setDuration(5);
        conference2.setLocation("Castillo Cote");
        conference2.setSpeakers(List.of(speaker2));
        conferenceRepository.saveAll(List.of(conference1, conference2));




        //Crear invitados
        Guest guest1 = new Guest();
        guest1.setName("Manuel Guillem");
        guest1.setStatusGuest(StatusGuest.ATTENDING);
        guest1.setEvent(conference1);

        Guest guest2 = new Guest();
        guest2.setName("Shara Martín");
        guest2.setStatusGuest(StatusGuest.NO_RESPONSE);
        guest2.setEvent(conference2);

        Guest guest3 = new Guest();
        guest3.setName("Alejandra Flores");
        guest3.setStatusGuest(StatusGuest.NOT_ATTENDING);
        guest3.setEvent(conference2);

        Guest guest4 = new Guest();
        guest4.setName("Sonia Cala");
        guest4.setStatusGuest(StatusGuest.ATTENDING);
        guest4.setEvent(conference1);

        guestRepository.saveAll(List.of(guest1, guest2, guest3, guest4));










    }
}
