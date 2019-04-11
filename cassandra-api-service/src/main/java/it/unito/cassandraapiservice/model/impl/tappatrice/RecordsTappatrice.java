package it.unito.cassandraapiservice.model.impl.tappatrice;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Builder
@Data
@Table(value = "records_tappatrice")
public class RecordsTappatrice {

    @PrimaryKey("time")
    private final String time;

    @Column("pezzi_prodotti")
    private int pezziProdotti;

    @Column("codice_prodotto")
    private String codiceProdotto;
}
