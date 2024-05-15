package br.com.felipearaujo.springbootchatgpt;

import reactor.core.publisher.Mono;

public interface StudyNotesService {
  Mono<String> createStudyNotes(String topic);
}
