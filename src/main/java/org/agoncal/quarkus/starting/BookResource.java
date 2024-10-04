package org.agoncal.quarkus.starting;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

import java.util.List;
import java.util.Optional;


@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @Inject
    BookRepository bookRepository;

    @Inject
    Logger logger;

    @GET
    public List<Book> books() {
        logger.info("Returns all books");
        return bookRepository.getAllBooks();
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public Integer count() {
        logger.info("Returns books count");
        return bookRepository.getAllBooks().size();
    }

    @GET
    @Path("{id}")
    public Optional<Book> bookByID (@PathParam("id") int id) {
        logger.info("Returns book with id: " + id);
        return bookRepository.getBookByID(id);
    }
}
