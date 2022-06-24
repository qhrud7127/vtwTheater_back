package com.vtw.dna.devExtreme.controller;

import com.vtw.dna.devExtreme.DevExtreme;
import com.vtw.dna.devExtreme.repository.DevExtremeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/devExtreme")
public class DevExtremeController {

    private final DevExtremeRepository repository;

   @GetMapping
   public Page<DevExtreme> list(@RequestParam("page") int page,
                           @RequestParam("size") int size,
                           @RequestParam(value = "sortBy", defaultValue = "devExtremeId") String sortBy,
                           @RequestParam(value = "sortDir", defaultValue = "asc") String sortDir,
                           @RequestParam(value = "filter", defaultValue = "") String filter) {
       Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortDir), sortBy));
       Page<DevExtreme> devExtremes = repository.findAllByTitleContains(pageable, filter);
       return devExtremes;
   }
    @GetMapping("/seqList")
    public List<DevExtreme> listSeqAndName() {
        List<DevExtreme> devExtreme = repository.findAll();
        return devExtreme;
    }

    @GetMapping("/{devExtremeId}")
    public DevExtreme find(@PathVariable Long devExtremeId) {
        DevExtreme devExtreme = repository.findById(devExtremeId).orElseThrow();
        return devExtreme;
    }

    @PostMapping
    public DevExtreme create(@RequestBody DevExtreme newOne) {
        repository.save(newOne);
        return newOne;
    }

    @PutMapping("/{devExtremeId}")
    public DevExtreme update(@PathVariable Long devExtremeId, @RequestBody DevExtreme newOne) {
        DevExtreme oldOne = repository.findById(devExtremeId).orElseThrow();
        oldOne.update(newOne);
        repository.save(oldOne);
        return oldOne;
    }

    @DeleteMapping("/{devExtremeId}")
    public DevExtreme delete(@PathVariable Long devExtremeId) {
        DevExtreme oldOne = repository.findById(devExtremeId).orElseThrow();
        repository.delete(oldOne);
        return oldOne;
    }

}
