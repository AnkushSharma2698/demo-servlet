package io.openliberty.sample.system.resources;

import java.io.IOException;
import java.util.List;

import io.openliberty.sample.system.models.Event;
import jakarta.enterprise.context.RequestScoped;
import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObjectBuilder;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RequestScoped
@WebServlet(name = "events", urlPatterns = { "/events" })
public class EventResource extends HttpServlet {

    @PersistenceContext(name = "jpa-unit")
    // end::PersistenceContext[]
    private EntityManager em;

    // tag::createEvent[]
    public void createEvent(Event event) {
        // tag::Persist[]
        em.persist(event);
        // end::Persist[]
    }
    // end::createEvent[]

    // tag::readEvent[]
    public Event readEvent(int eventId) {
        // tag::Find[]
        return em.find(Event.class, eventId);
        // end::Find[]
    }
    // end::readEvent[]

    // tag::updateEvent[]
    public void updateEvent(Event event) {
        // tag::Merge[]
        em.merge(event);
        // end::Merge[]
    }
    // end::updateEvent[]

    // tag::deleteEvent[]
    public void deleteEvent(Event event) {
        // tag::Remove[]
        em.remove(event);
        // end::Remove[]
    }
    // end::deleteEvent[]

    // tag::readAllEvents[]
    public List<Event> readAllEvents() {
        return em.createNamedQuery("Event.findAll", Event.class).getResultList();
    }
    // end::readAllEvents[]

    // tag::findEvent[]
    public List<Event> findEvent(String name, String location, String time) {
        return em.createNamedQuery("Event.findEvent", Event.class).setParameter("name", name)
                .setParameter("location", location).setParameter("time", time).getResultList();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        JsonArrayBuilder finalArray = Json.createArrayBuilder();
        for (Event event : readAllEvents()) {
            builder.add("name", event.getName()).add("time", event.getTime()).add("location", event.getLocation())
                    .add("id", event.getId());
            finalArray.add(builder.build());
        }
        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().println(finalArray.build().toString());
    }

}