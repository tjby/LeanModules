package io.leanddd.module.security.model;

import io.leanddd.component.framework.MetadataProvider;
import io.leanddd.component.meta.Metadata;
import io.leanddd.component.meta.Service;
import io.leanddd.component.meta.Service.Type;
import io.leanddd.module.security.api.MetadataService;
import lombok.RequiredArgsConstructor;

import javax.inject.Named;

@Service(type = Type.Mixed)
@RequiredArgsConstructor
@Named
public class MetadataServiceImpl implements MetadataService {

    private final MetadataProvider metadataProvider;

    @Override
    public Metadata getMetadata() {
        return metadataProvider.getMetadata(null);
    }

}
