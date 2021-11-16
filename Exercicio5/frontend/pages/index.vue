<template>
  <v-row>
    <v-col cols="12" sm="8" md="6">
      <v-card>
        <v-card-title class="headline"> Veículos Cadastrados</v-card-title>
        <v-card-text>
          <p v-if="veiculos">
            <v-list flat>
              <v-list-item v-for="(item, i) in veiculos" :key="i">
                <v-list-item-action>
                  <a @click.prevent="del(item.veiculo)"
                    ><v-icon>mdi-delete</v-icon></a
                  >
                </v-list-item-action>
                <v-list-item-content>
                  <v-list-item-title>
                    Descrição: {{ item.descricao }}
                  </v-list-item-title>

                  <v-list-item-subtitle>
                    Marca: {{ item.marca }} | Ano: {{ item.ano }}
                    <span v-if="item.vendido">| Vendido</span>
                  </v-list-item-subtitle>
                  <v-divider />
                </v-list-item-content>
              </v-list-item>
            </v-list>
          </p>
           <v-card-title v-show="naoVendidos">Quantidade de veículos não vendidos: {{naoVendidos}}</v-card-title>
        </v-card-text>
      </v-card>
    </v-col>
  </v-row>
</template>
<script>
export default {
  data() {
    return {
      veiculos: null,
      naoVendidos: null,
    };
  },
  mounted() {
    this.load();
    this.$axios
      .get("veiculos/search/qtdVeiculosNaoVendidos")
      .then((response) => {
        this.naoVendidos = response.data;
      })
      .catch(function (error) {
        console.log(error);
        alert("Ocorreu um erro");
      });
  },
  methods: {
    load() {
      this.$axios
        .get("veiculos/search/findAllByOrderByCreatedDesc")
        .then((response) => {
          this.veiculos = response.data._embedded.veiculo;
        })
        .catch(function (error) {
          console.log(error);
          alert("Ocorreu um erro");
        });
    },
    del(id) {
      var r = confirm("Deseja realmente excluir");
      if (r == true) {
        this.$axios
          .delete("veiculos/" + id)
          .then((response) => {
            alert("Veículo excluido");
            this.load();
          })
          .catch(function (error) {
            console.log(error);
            alert("Ocorreu um erro");
          });
      }
    },
  },
};
</script>
