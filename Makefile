
# Exponential
exponential: compile compile-exponential plot-exponential

plot-exponential:
	./plot.sh output/3elt.graph_NS_HYBRID_GICP_ROUND_ROBIN_T_1.0_D_0.05_RNSS_3_URSS_6_A_2.0_R_1000.txt

compile-exponential:
	./run.sh -graph graphs/twitter.graph -simulatedAnnealing EXPONENTIAL -delta 0.05 -alpha 2.0 -temp 1.0 -rounds 5000




# Exponential restart
exponential-restart: compile compile-exponential-restart plot-exponential-restart

plot-exponential-restart:
	./plot.sh output/3elt.graph_NS_HYBRID_GICP_ROUND_ROBIN_T_1.0_D_0.1_RNSS_3_URSS_6_A_2.0_R_1000.txt

compile-exponential-restart:
	./run.sh -graph graphs/add20.graph -simulatedAnnealing EXPONENTIAL -delta 0.05 -alpha 2 -temp 1 -restartSA 100 -rounds 2000



# Linear
linear: compile compile-linear plot-linear

plot-linear:
	./plot.sh output/3elt.graph_NS_HYBRID_GICP_ROUND_ROBIN_T_2.0_D_0.001_RNSS_3_URSS_6_A_2.0_R_1000.txt

compile-linear:
	./run.sh -graph graphs/3elt.graph -simulatedAnnealing LINEAR -delta 0.001 -temp 2.0 -rounds 1000

# Linear restart
linear-restart: compile compile-linear-restart plot-linear-restart

plot-linear-restart:
	./plot.sh output/3elt.graph_NS_HYBRID_GICP_ROUND_ROBIN_T_2.0_D_0.003_RNSS_3_URSS_6_A_2.0_R_1200.txt

compile-linear-restart:
	./run.sh -graph graphs/3elt.graph -simulatedAnnealing LINEAR -delta 0.003 -temp 2.0 -restartSA 400 -rounds 1200


# Common commands
compile:
	./compile.sh

clean:
	rm -f output/*
