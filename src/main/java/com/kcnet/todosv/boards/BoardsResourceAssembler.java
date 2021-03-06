package com.kcnet.todosv.boards;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class BoardsResourceAssembler implements RepresentationModelAssembler<Boards, EntityModel<Boards>> {

    @Override
    public EntityModel<Boards> toModel(Boards boards) {
        return new EntityModel<>(boards,
                linkTo(methodOn(BoardsController.class).get(boards.getBoardId())).withSelfRel());
    }
}
